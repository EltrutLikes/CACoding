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
        List<String> lst = userDataAccessObject.getAll();
        userDataAccessObject.deleteAll();
        ClearOutputData clearOutputData = new ClearOutputData(lst);
        userPresenter.prepareSuccessView(clearOutputData);
    }
}
