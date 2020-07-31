package com.example.smellslikebakin;

public class DirectionsFragment extends CheckboxesFragment {
    @Override
    public String[] getContents(int index) {
        return Recipes.directions[index].split("`");
    }
}
