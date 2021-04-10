package homepage;

import common.WebAPI;

public class Login extends WebAPI {
    public void login() throws Exception {

        String tableName = "user";

        login1( login_btn, tableName, input_user , input_pwd , login_submit);
    }

}
