package com.example.smellslikebakin;

public class IngredientsFragment extends CheckboxesFragment {
    @Override
    public String[] getContents(int index) {
        return Recipes.ingredients[index].split("`");
    }
}
