package au.com.ncs.strategies;

import au.com.ncs.model.Planet;

public class MatchingStrategyName implements MatchingStrategy {


    private final String name;

    public MatchingStrategyName(String name) {
        this.name = name;
    }

    @Override
    public boolean match(Planet planet) {
        return planet.getName() == name;
    }
}
