package top.focess.fchemistry;

import top.focess.fchemistry.elements.Elements;

public interface Substance {

//    double getBoilingPoint();

    record PartSubstance(Elements elements, int count) {

        public Elements getElements() {
            return elements;
        }

        public int getCount() {
            return count;
        }

        public double getMass() {
            return count * elements.getMass();
        }
    }
}
