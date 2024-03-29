/* ************************************************************************** */
/*                                                                            */
/*                                                        :::      ::::::::   */
/*   NumberWorkerTest.java                              :+:      :+:    :+:   */
/*                                                    +:+ +:+         +:+     */
/*   By: kferterb <kferterb@student.21-school.ru    +#+  +:+       +#+        */
/*                                                +#+#+#+#+#+   +#+           */
/*   Created: 2022/07/26 15:51:05 by kferterb          #+#    #+#             */
/*   Updated: 2022/07/26 15:51:06 by kferterb         ###   ########.fr       */
/*                                                                            */
/* ************************************************************************** */

package edu.school21.numbers;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

public class NumberWorkerTest {

    @ParameterizedTest
    @ValueSource(ints = {2, 3, 113})
    public void isPrimeForPrimes(int number) {
        assertTrue(new NumberWorker().isPrime(number));
    }

    @ParameterizedTest
    @ValueSource(ints = {6, 42, 195})
    public void isPrimeForNotPrimes(int number) {
        assertFalse(new NumberWorker().isPrime(number));
    }

    @ParameterizedTest
    @ValueSource(ints = {-1, 0, -122})
    public void isPrimeForIncorrectNumbers(int number) {
        assertThrows(IllegalNumberException.class, () -> new NumberWorker().isPrime(number), "Not thrown exception");
    }

    @ParameterizedTest
    @CsvFileSource(resources = "/data.csv")
    public void isCorrectDigitsSum(int number, int sum) {
        assertEquals(new NumberWorker().digitsSum(number), sum);
    }
}
