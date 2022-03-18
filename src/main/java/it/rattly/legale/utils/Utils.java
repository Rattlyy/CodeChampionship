package it.rattly.legale.utils;

import com.vaadin.flow.component.UI;

import java.util.concurrent.CompletableFuture;

public class Utils {
    public static void set(String key, String value) {
        UI.getCurrent().getElement().executeJs("debugger; window.localStorage.setItem($0, $1);", key, value);
    }

    public static CompletableFuture<String> get(String key) {
        CompletableFuture<String> future = new CompletableFuture<>();

        UI.getCurrent().getElement().executeJs("debugger;return window.localStorage.getItem($0);", key)
                .then(String.class, future::complete);

        return future;
    }
}
