package case_study.model.facility;

import java.util.Comparator;

public class SortPrice implements Comparator<House> {
    @Override
    public int compare(House o1, House o2) {
        return  o1.rentingPrice - o2.rentingPrice == 0 ? 1 : (int) (o1.rentingPrice - o2.rentingPrice);
    }
}
