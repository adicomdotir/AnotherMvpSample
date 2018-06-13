package ir.adicom.app.anothermvpsample;

import java.util.Random;

/**
 *
 * Created by Yashar.P on 6/13/2018.
 */

public class MainModelImpl implements MainModel {
    @Override
    public int getRandomGrade() {
        Random random = new Random(System.currentTimeMillis());
        return (int) (random.nextFloat() * 20);
    }
}
