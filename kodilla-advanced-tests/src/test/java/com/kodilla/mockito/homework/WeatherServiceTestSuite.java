package com.kodilla.mockito.homework;
import com.kodilla.notification.Client;
import com.kodilla.notification.Notification;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import javax.xml.stream.Location;
import java.util.HashSet;
import java.util.Set;

public class WeatherServiceTestSuite {
    WeatherService weatherService = new WeatherService();
    Client client = Mockito.mock(Client.class);
    Client client1 = Mockito.mock(Client.class);
    Client client2 = Mockito.mock(Client.class);
    Client client3 = Mockito.mock(Client.class);
    Notification notification = Mockito.mock(Notification.class);
    Location location = Mockito.mock(Location.class);
    Location location1 = Mockito.mock(Location.class);
    Set<Client> clients = new HashSet<>();
    Set<Location> locations = new HashSet<>();

    @BeforeEach
    public void prepareData() {
        clients.add(client);
        clients.add(client1);
        clients.add(client2);
        clients.add(client3);
        locations.add(location);
        locations.add(location1);
        for (Location location : locations) {
            weatherService.addSubscriber(client,location);
        }
    }

    @Test
    public void subscriberShouldReceiveNotificationFromLocationToWitchHeIsSubscribed() {
        for(Location location: locations) {
            weatherService.sentNotificationToLocation(notification, location);
        }
        Mockito.verify(client, Mockito.times(2)).receive(notification);
    }

    @Test
    public void subscriberShouldBeAbleToRemoveSubscriptionToLocation() {
        weatherService.removeSubscriptionFromLocation(client, location1);
        for(Location location: locations) {
            weatherService.sentNotificationToLocation(notification, location);
        }
        Mockito.verify(client, Mockito.times(1)).receive(notification);
    }

    @Test
    public void shouldRemoveAllSubscriptions() {
        weatherService.removeAllSubscriptions(client);

        for(Location location: locations) {
            weatherService.sentNotificationToLocation(notification, location);
        }
        Mockito.verify(client, Mockito.never()).receive(notification);
    }

    @Test
    public void shouldSentNotificationOnlyToSubscribesSubscribedToLocation() {
        weatherService.removeSubscriptionFromLocation(client, location1);
        weatherService.addSubscriber(client1, location);
        weatherService.addSubscriber(client2, location);
        weatherService.addSubscriber(client3, location1);
        for(Location location: locations) {
            weatherService.sentNotificationToLocation(notification, location);
        }
        for(Client client : this.clients){
            Mockito.verify(client, Mockito.times(1)).receive(notification);
        }
    }

    @Test
    public void shouldSentNotificationToAllSubscribers() {
        weatherService.addSubscriber(client, location);
        weatherService.addSubscriber(client1, location1);
        weatherService.addSubscriber(client2, location1);
        weatherService.addSubscriber(client3, location);
        weatherService.sendNotificationToAll(notification);
        for(Client client : this.clients){
            Mockito.verify(client, Mockito.times(1)).receive(notification);
        }
    }

    @Test
    public void shouldRemoveLocationForAllSubscribers() {
        for (Client client : clients) {
            weatherService.addSubscriber(client,location);
        }
        weatherService.removeLocation(location);
        for(Client client : this.clients){
            Mockito.verify(client, Mockito.never()).receive(notification);
        }
    }
}