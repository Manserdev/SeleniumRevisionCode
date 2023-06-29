package au.com.ncs.strategies;

import au.com.ncs.model.Planet;

public interface MatchingStrategy {

    public boolean match(Planet planet);
}
