//package com.kodilla.parametrized_tests.homework;
//
//import org.junit.jupiter.params.provider.Arguments;
//
//import java.util.stream.Stream;
//
//public class DataBMI {
//
//    public static Stream<Arguments> dataProviderForTestingBmi(){
//        return Stream.of(
//                Arguments.of(1.60, 43.0, "Very severely underweight"),
//                Arguments.of(1.65, 47.0, "Severely underweight"),
//                Arguments.of(1.70,56.5, "Underweight"),
//                Arguments.of(1.75,68.0, "Normal (healthy weight)"),
//                Arguments.of(1.80,81.0, "Overweight"),
//                Arguments.of(1.85, 100.0, "Obese Class I (Moderately obese)"),
//                Arguments.of(1.90, 93.6, "Obese Class II (Severely obese)"),
//                Arguments.of(1.95, 110.3, "Obese Class III (Very severely obese)"),
//                Arguments.of(2.00, 125.0, "Obese Class IV (Morbidly Obese)"),
//                Arguments.of(2.05, 140.0, "Obese Class V (Super Obese)"),
//                Arguments.of(2.10, 155.0, "Obese Class VI (Hyper Obese)")
//        );
//    }
//}
