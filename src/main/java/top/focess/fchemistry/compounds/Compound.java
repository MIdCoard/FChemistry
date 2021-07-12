package top.focess.fchemistry.compounds;

import com.google.common.collect.Lists;
import top.focess.fchemistry.Substance;

import java.util.List;

public enum Compound implements Substance {

    ;

    private final List<PartSubstance> partSubstanceList;
    private final double mass;


    Compound(PartSubstance... partSubstances) {
        this.partSubstanceList = Lists.newArrayList(partSubstances);
        this.mass = this.partSubstanceList.stream().map(PartSubstance::getMass).mapToDouble(d->d).sum();
    }

    public double getMass() {
        return mass;
    }
}
