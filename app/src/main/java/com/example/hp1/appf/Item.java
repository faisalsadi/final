package com.example.hp1.appf;

/**
 * Created by Hp1 on 27/09/2017.
 */

public class Item {
        private String title;
        private int imageid;
        public Item(String title, int imageid) {
            this.title = title;
            this.imageid = imageid;
        }

        public String getTitle() {
            return title;
        }

        public int getImageid() {
            return imageid;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public void setImageid(int imageid) {
            this.imageid = imageid;
        }
    }


