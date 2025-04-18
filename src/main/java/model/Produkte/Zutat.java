package model.Produkte;

    public class Zutat {
        private int id;
        private String name;

        public Zutat(int id, String name) {
            this.id = id;
            this.name = name;
        }

        // Getter und Setter
        public int getId() {
            return id;
        }

        public String getName() {
            return name;
        }
    }


