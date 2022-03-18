package it.rattly.legale.views.main;

import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;
import com.vaadin.flow.router.RouteAlias;
import it.rattly.legale.Constants;
import it.rattly.legale.views.MainLayout;

import javax.annotation.security.PermitAll;

@PageTitle(Constants.NOME)
@Route(value = "main", layout = MainLayout.class)
@RouteAlias(value = "", layout = MainLayout.class)
@PermitAll
public class MainView extends HorizontalLayout {

    public MainView() {
        //TODO
    }
}
