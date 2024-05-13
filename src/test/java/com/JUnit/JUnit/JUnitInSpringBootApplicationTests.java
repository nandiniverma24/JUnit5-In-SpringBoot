package com.JUnit.JUnit;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

class JUnitInSpringBootApplicationTests {

	private Calculator c=new Calculator();

	@Test
	void contextLoads() {
	}

	@Test
	void testSum()
	{
		//expected result
		int expectedResult=17;

		//actual result
		int actualResult=c.doSum(12,3,2);

		assertThat(actualResult).isEqualTo(expectedResult);
	}

	@Test
	@Disabled
	void testProduct()
	{
		//expected
		int expectedResult=6;

		//actual
		int actualResult=c.doProduct(2,3);

		assertThat(actualResult).isEqualTo(expectedResult);

	}

	@Test
	void compareTwoNums()
	{
		//actual result
		Boolean actualResult=c.compareTwoNums(3,3);

		assertThat(actualResult).isTrue();

	}

}
