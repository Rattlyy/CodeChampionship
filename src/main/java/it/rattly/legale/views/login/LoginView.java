package it.rattly.legale.views.login;

import com.vaadin.flow.component.login.LoginI18n;
import com.vaadin.flow.component.login.LoginOverlay;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;
import it.rattly.legale.Constants;

@PageTitle("Login")
@Route(value = "login")
public class LoginView extends LoginOverlay {
    public LoginView() {
        setAction("login");

        LoginI18n i18n = LoginI18n.createDefault();
        i18n.setHeader(new LoginI18n.Header());
        i18n.getHeader().setTitle(Constants.NOME);
        i18n.getHeader().setDescription("Login using user/user or admin/admin");
        i18n.setAdditionalInformation(null);
        setI18n(i18n);

        setForgotPasswordButtonVisible(false);
        setOpened(true);
    }

}
