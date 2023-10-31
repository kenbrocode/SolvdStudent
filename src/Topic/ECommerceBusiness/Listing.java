package Topic.ECommerceBusiness;

public class Listing {

        private static int id;
        private String name;
        private Location location;
        private Reviews[] reviews;

        private Seller[] sellers;



        public Listing(String name, Location location, Reviews[] reviews, Seller[] sellers){
            id++;
            this.name = name;
            this.location = location;
            this.reviews = reviews;
            this.sellers = sellers;
        }


        public int getId() {
            return id;
        }

        public void setId(int id) {
            Listing.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

    }

