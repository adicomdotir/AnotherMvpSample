package ir.adicom.app.anothermvpsample;

/**
 *
 * Created by Yashar.P on 6/13/2018.
 */

public class MainPresenterImpl implements MainPresenter {

    private MainView mMainView;
    private MainModel mMainModel;

    public MainPresenterImpl(MainView mainView) {
        mMainView = mainView;
        mMainModel = new MainModelImpl();
    }

    @Override
    public void click() {
        mMainView.setMessage("Your grade is : " + mMainModel.getRandomGrade());
    }
}
