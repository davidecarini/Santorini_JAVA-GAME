package it.polimi.ingsw.Le_Bestie.Model.Builder;
/**
 * 
 */
public enum BuilderColor {
    WHITE, LIGHT, BLUE, BROWN;

    //This method return the object of color request if the color chosen is a possible Builder color else return null
    public static BuilderColor getColor(String colorBuilderChosen) {
        BuilderColor[] colors = values();
        for (BuilderColor color : colors) {
            if (color.name().equalsIgnoreCase(colorBuilderChosen)) {
                return color;
            }
        }
        return null;
    }
}