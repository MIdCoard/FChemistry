package top.focess.fchemistry.elements;

import com.google.common.collect.Lists;
import top.focess.fchemistry.Substance;

import java.util.ArrayList;
import java.util.List;

public enum Element implements Substance{
    HYDROGEN(new PartSubstance(Elements.HYDROGEN,2)),
    OXYGEN(new PartSubstance(Elements.OXYGEN,2))
    ;

    private final PartSubstance partSubstance;
    private final double mass;

    Element(Substance.PartSubstance partSubstance) {
        this.partSubstance = partSubstance;
        this.mass = partSubstance.getMass();
    }

    public double getMass() {
        return mass;
    }

    public PartSubstance getPartSubstance() {
        return partSubstance;
    }
}
