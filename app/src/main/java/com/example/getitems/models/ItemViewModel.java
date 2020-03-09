package com.example.getitems.models;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

/**
 * Helper class for providing sample content for user interfaces created by
 * Android template wizards.
 * <p>
 * TODO: Replace all uses of this class before publishing your app.
 */
public class ItemViewModel {

    /**
     * An array of sample (dummy) items.
     */
    public static final List<ItemModel> ITEMS = new ArrayList<ItemModel>();

    /**
     * A map of sample (dummy) items, by ID.
     */
    public static final Map<String, ItemModel> ITEM_MAP = new HashMap<String, ItemModel>();

    private static final int COUNT = 25;

    static {
        addItem(new ItemModel("Athletic Socks", "Simple athletic socks", 0, 0, 1,""));
        addItem(new ItemModel("Bunny Slippers", "Fluffy slippers that look like bunnies", 1, 0, 2,""));
        addItem(new ItemModel("Comfy Sneakers", "Sneakers that are comfortable to walk and stand in", 2, 0, 2,""));
    }

    private static void addItem(ItemModel item) {
        ITEMS.add(item);
        ITEM_MAP.put(item.id, item);
    }

//    private static ItemModel createDummyItem(int position) {
//        return new ItemModel(String.valueOf(position), "Item " + position, makeDetails(position));
//    }

    private static String makeDetails(int position) {
        StringBuilder builder = new StringBuilder();
        builder.append("Details about Item: ").append(position);
        for (int i = 0; i < position; i++) {
            builder.append("\nMore details information here.");
        }
        return builder.toString();
    }

    /**
     * A dummy item representing a piece of content.
     */
    public static class ItemModel {
        public final String id = UUID.randomUUID().toString();
        public final String Guid = id;
        public final String Name;
        public final String Description;
        public final int Range;
        public final int Damage;
        public final int Value;
        public final String ImageURI;


        public ItemModel(String name, String description, int range, int damage, int value, String uri) {
            this.Name = name;
            this.Description = description;
            this.Range = range;
            this.Damage = damage;
            this.Value = value;
            this.ImageURI = uri;
        }

        @Override
        public String toString() {
            return Name;
        }
    }
}
