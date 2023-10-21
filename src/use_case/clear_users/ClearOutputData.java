package use_case.clear_users;

import java.util.List;

public class ClearOutputData {

    public final List<String> usernames;

    public ClearOutputData(List<String> usernames) {
        this.usernames = usernames;
    }
}
