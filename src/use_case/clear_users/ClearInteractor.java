package use_case.clear_users;

import java.util.List;

public class ClearInteractor implements ClearInputBoundary {
    final ClearUserDataAccessInterface userDataAccessObject;
    final ClearOutputBoundary userPresenter;

    public ClearInteractor(ClearUserDataAccessInterface userDataAccessObject,
                           ClearOutputBoundary userPresenter) {
        this.userDataAccessObject = userDataAccessObject;
        this.userPresenter = userPresenter;
    }

    @Override
    public void execute() {
        ClearOutputData clearOutputData = new ClearOutputData(userDataAccessObject.deleteAll());
        userPresenter.prepareSuccessView(clearOutputData);
    }
}
