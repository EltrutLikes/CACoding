package interface_adapter.clear_users;

// TODO Complete me

import interface_adapter.ViewModel;

import java.beans.PropertyChangeListener;

public class ClearViewModel extends ViewModel {
    public final String TITLE_LABEL = "Clear View";

    public ClearViewModel() {
        super("clear");
    }

    @Override
    public void firePropertyChanged() {

    }

    @Override
    public void addPropertyChangeListener(PropertyChangeListener listener) {

    }
}
