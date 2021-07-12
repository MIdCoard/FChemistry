package top.focess.fchemistry.elements;

public enum Elements {

    HYDROGEN("H",1,1,false),
    HELIUM("He",2,4,false),
    LITHIUM("Li",3,7),
    BERYLLIUM("Be",4,9),
    BORON("B",5,11,false),
    CARBON("C",6,12,false),
    NITROGEN("N",7,14,false),
    OXYGEN("O",8,16,false),
    FLUORINE("F",9,19,false),
    NEON("Ne",10,20,false),
    SODIUM("Na",11,23),
    MAGNESIUM("Mg",12,24),
    ALUMINIUM("Al",13,27),
    SILICON("Si",14,28,false),
    PHOSPHORUS("P",15,31,false),
    SULFUR("S",16,32,false),
    CHLORINE("Cl",17,35.5,false),
    ARGON("Ar",18,40,false),
    POTASSIUM("K",19,39),
    CALCIUM("Ca",20,40),

    TITANIUM("Ti",22,48),
    VANADIUM("V",23,51),

    MANGANESE("Mn",25,55),
    IRON("Fe",26,56),
    NICKEL("Ni",28,59),
    COPPER("Cu",29,63.5),
    ZINC("Zn",30,65.5),

    ARSENIC("As",33,75,false),
    SELENIUM("Se",34,79,false),
    BROMINE("Br",35,80,false),
    STRONTIUM("Sr",38,88),

    SILVER("Ag",47,108),
    TIN("Sn",50,119),
    IODINE("I",53,127,false),
    CAESIUM("Cs",55,133),

    BARIUM("Ba",56,137),
    PLATINUM("Pt",78,195),
    GOLD("Au",79,197),
    MERCURY("Hg",80,200.5),
    LEAD("Pb",82,207),
    POLONIUM("Po",84,209),


    URANIUM("U",92,238),
    PLUTONIUM("Pu",94,244),



    ;

    private final String symbol;
    private final int number;
    private final double mass;
    private final boolean isMetal;

    Elements(String symbol, int number, double mass,boolean isMetal) {
        this.symbol = symbol;
        this.number = number;
        this.mass = mass;
        this.isMetal = isMetal;
    }

    //for Metal
    Elements(String symbol, int number, double mass) {
        this(symbol,number,mass,true);
    }

    public double getMass() {
        return mass;
    }

    public boolean isMetal() {
        return isMetal;
    }

    public int getNumber() {
        return number;
    }

    public String getSymbol() {
        return symbol;
    }
}
