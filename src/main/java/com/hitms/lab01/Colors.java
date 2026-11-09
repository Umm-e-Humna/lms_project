package com.hitms.lab01;

import org.fusesource.jansi.AnsiConsole;
import static org.fusesource.jansi.Ansi.ansi;

public class Colors {

    public static void main(String[] args) {
        AnsiConsole.systemInstall();

        System.out.println(
            ansi().fgGreen()
                .a("Hello, Software Construction!")
                .reset()
        );

        AnsiConsole.systemUninstall();
    }
}