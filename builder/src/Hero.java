class Hero {
    private final String profession;
    private final String name;
    private final String hairColor;

    @Override
    public String toString() {
        return "Hero{" +
                "profession='" + profession + '\'' +
                ", name='" + name + '\'' +
                ", hairColor='" + hairColor + '\'' +
                '}';
    }

    private Hero(HeroBuilder builder) {
        profession = builder.getProfession();
        name = builder.getName();
        hairColor = builder.getHairColor();
    }

    static class HeroBuilder {
        private final String profession;
        private final String name; // we make final the things that are mandatory
        private String hairColor;

        HeroBuilder(String profession, String name) {
            if (profession == null || name == null) {
                throw new IllegalArgumentException("pro and name cannot be null");
            }
            this.profession = profession;
            this.name = name;
        }

        HeroBuilder withHairColo(String hairColor) {
            this.hairColor = hairColor;
            return this;
        }

        String getProfession() {
            return profession;
        }

        String getName() {
            return name;
        }

        String getHairColor() {
            return hairColor;
        }

        Hero build() {
            return new Hero(this);
        }
    }
}
