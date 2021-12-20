public enum Properties {

    CATEGORY, MANUFACTURER, MODEL, ENGINE, PRICE;

    public void messageType(Properties p) {

        Properties[] properties = values();

        for (Properties message : properties) {
            switch (message) {
                case MANUFACTURER, MODEL, ENGINE, CATEGORY -> {
                    System.out.println(" does not exist");
                }
                case PRICE -> {
                    System.out.println("Entered price does not match any records");
                }
            }

        }


    }

}

