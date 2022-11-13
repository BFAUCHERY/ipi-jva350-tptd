package com.ipi.jva350.model;

import java.time.LocalDate;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class EntrepriseTest {

	@ParameterizedTest(name = "Date {0}, expect ferié : {1}")
	@CsvSource({
	"'2022-11-10', 'false'",
	"'2022-11-11', 'true'",
	"'2022-11-12', 'false'",
	"'2022-12-08', 'false'",
	"'2022-01-01', 'true'",
	"'2023-07-14', 'true'",
	"'2023-04-10', 'true'",
	"'2023-06-22', 'false'"
	})
	void testEstJourFerie(LocalDate date,boolean expectFerie) {
		//Given, When, Then
		Assertions.assertEquals(expectFerie,Entreprise.estJourFerie(date));
	}

}
