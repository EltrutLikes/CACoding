package interface_adapter.clear_users;

import java.util.ArrayList;
import java.util.List;

public class ClearState {
    private List<String> usernames = new ArrayList<>();

    public ClearState(ClearState copy) {
        this.usernames = copy.usernames;
    }

    public ClearState() {}

    public List<String> getUsernames() {
        return this.usernames;
    }
}
