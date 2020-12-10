package subway.domain;

import java.util.Arrays;

public enum MainMenuType implements Menu {

    STATION_MANAGE("1"),
    LINE_MANAGE("2"),
    SECTION_MANAGE("3"),
    PRINT_MAP("4"),
    END_PROGRAM("Q");

    private String menuInput;

    MainMenuType(String menuInput) {
        this.menuInput = menuInput;
    }

    public static MainMenuType validateMenu(String menuInput) {
        return Arrays.stream(MainMenuType.values())
                .filter(menu -> menu.menuInput.equals(menuInput.toUpperCase()))
                .findFirst()
                .orElseThrow(() -> new IllegalArgumentException(MAIN_MENU_ERROR));
    };


}
