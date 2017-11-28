package com.example.assertions;

import com.example.models.Planet;
import org.assertj.core.api.AbstractAssert;
import org.assertj.core.api.Assertions;

public class PlanetAssertion extends AbstractAssert<PlanetAssertion, Planet> {

    private PlanetAssertion(Planet planet, Class<?> selfType) {
        super(planet, selfType);
    }

    public static final PlanetAssertion assertThat(final Planet actual) {
        return new PlanetAssertion(actual, PlanetAssertion.class);
    }

    // Here custom assertion methods starts
    public PlanetAssertion hasName(final String expectedName) {
        Assertions.assertThat(actual.getName()).isEqualTo(expectedName);
        return this;
    }

    public PlanetAssertion filmsCount(final int expectedCount) {
        Assertions.assertThat(actual.getFilms().size()).isEqualTo(expectedCount);
        return this;
    }
}
