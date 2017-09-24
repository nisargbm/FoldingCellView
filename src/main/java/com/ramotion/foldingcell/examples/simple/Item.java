package com.ramotion.foldingcell.examples.simple;

import android.view.View;

import java.util.ArrayList;

/**
 * Simple POJO model for example
 */
public class Item {

    private String name;
    private String players;
    private String fromDate;
    private String toDate;
    private String details;
    private String date;
    private String time;

    private View.OnClickListener requestBtnClickListener;

    public Item() {
    }

    public Item(String name, String players, String fromDate, String toDate, String details, String date, String time) {
        this.name = name;
        this.players = players;
        this.fromDate = fromDate;
        this.toDate = toDate;
        this.details = details;
        this.date = date;
        this.time = time;
    }

    public String getName() {
        return name;
    }

    public void setName(String game_name) {
        this.name = game_name;
    }

    public String getPlayers() {
        return players;
    }

    public void setPlayers(String players) {
        this.players = players;
    }

    public String getFromDate() {
        return fromDate;
    }

    public void setFromDate(String fromAddress) {
        this.fromDate = fromDate;
    }

    public String getToDate() {
        return toDate;
    }

    public void setToDate(String toAddress) {
        this.toDate = toDate;
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(int requestsCount) {
        this.details = details;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public View.OnClickListener getRequestBtnClickListener() {
        return requestBtnClickListener;
    }

    public void setRequestBtnClickListener(View.OnClickListener requestBtnClickListener) {
        this.requestBtnClickListener = requestBtnClickListener;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Item item = (Item) o;

        if (details !=null ?!details.equals(item.details):item.details!=null) return false;
        if (name != null ? !name.equals(item.name) : item.name != null) return false;
        if (players != null ? !players.equals(item.players) : item.players != null)
            return false;
        if (fromDate != null ? !fromDate.equals(item.fromDate) : item.fromDate != null)
            return false;
        if (toDate != null ? !toDate.equals(item.toDate) : item.toDate != null)
            return false;
        if (date != null ? !date.equals(item.date) : item.date != null) return false;
        return !(time != null ? !time.equals(item.time) : item.time != null);

    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + (players != null ? players.hashCode() : 0);
        result = 31 * result + (fromDate != null ? fromDate.hashCode() : 0);
        result = 31 * result + (toDate != null ? toDate.hashCode() : 0);
        result = 31 * result + (details != null ? details.hashCode() : 0);
        result = 31 * result + (date != null ? date.hashCode() : 0);
        result = 31 * result + (time != null ? time.hashCode() : 0);
        return result;
    }

    /**
     * @return List of elements prepared for tests
     */
    public static ArrayList<Item> getTestingList() {
        ArrayList<Item> items = new ArrayList<>();
        items.add(new Item("Cricket", "2 players", "21st November 2017", "22st November 2017", "'Why do we fall? So we can learn to pick ourselves back up.'", "TODAY", "05:10 PM"));
        items.add(new Item("Football", "3 players", "23st November 2017", "24st November 2017", "ABCD", "TODAY", "11:10 AM"));
        items.add(new Item("Badminton", "4 players", "24st November 2017", "25st November 2017", "EFGH", "TODAY", "07:11 PM"));
        items.add(new Item("Kabaddi", "5 players", "25st November 2017", "26st November 2017","IJKL", "TODAY", "4:15 AM"));
        items.add(new Item("Tennis", "6 players", "26st November 2017", "27st November 2017", "MNOP", "TODAY", "06:15 PM"));
        return items;

    }

}
