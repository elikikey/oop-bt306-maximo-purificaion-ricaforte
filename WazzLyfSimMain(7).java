package oop1;



import java.util.Scanner;

public class WazzLyfSimMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        boolean loginSuccessful = false;

   do {
    clearConsole();
    System.out.println("==============================================");
    System.out.println("               Welcome To Login!              ");
    System.out.println("==============================================\n");
    System.out.print("Enter your username: ");
    String uName = scanner.nextLine();
    System.out.print("Enter your password: ");
    String password = scanner.nextLine();

    if (validateLogin(uName, password)) {
        loginSuccessful = true;

        clearConsole();
        System.out.println("\n==============================================");
        System.out.println("               Login Successful!              ");


        anotherCharacter(scanner);
            
            while (true){
                System.out.println("\n============================================== ");
                System.out.println("Press 'C' To Create Another Character");
                System.out.println("Press 'P' To Play");
                System.out.println("Press 'E' To Exit");
                System.out.print("Your choice: ");
                String choice = scanner.nextLine().toUpperCase();

                switch (choice) {
                    case "C":
                       anotherCharacter(scanner);
                       break; 
                    case "P":
                        System.out.println("\nGame Loading..... ");
                        System.out.println("\n============================================== ");
                        System.out.println("Get ready, your new life will start now!");
                        System.out.println("============================================== ");
                        System.exit(0);

                    case "E":
                        System.out.println("\n============================================== ");
                        System.out.println("     Logging out..... Until Next Game!!! ");
                        System.out.println("============================================== ");
                        System.exit(0);

                    default:
                        System.out.println("Invalid input. Please enter 'C', 'P', or 'E'");
                        break;
                }
            }

    } else {
        System.out.println("Login Failed. Please try again.\n");
    }

} while (!loginSuccessful);

clearConsole();
scanner.close();
    }
        

    private static void anotherCharacter(Scanner scanner) {
        WazzLyfSimClass character = new WazzLyfSimClass();
        String nickname;
    
        do {
            System.out.println("==============================================");
            System.out.print("\nEnter A Nickname: ");
            nickname = scanner.nextLine();
    
            if (nickname.isEmpty()) {
                
                System.out.println("\n============================================== ");
                System.out.println("             Please Don't Skip !!! ");
            }
    
        } while (nickname.isEmpty());
    
        clearConsole();
        System.out.println("\n============================================== ");
        System.out.println("        WELCOME TO WAZZ LIFE SIMULATOR     ");
        centerText(nickname);
        System.out.println("         Let's create your character.       ");
        System.out.println("==============================================");
    
        character.customizeCharacter();
        character.displayCharacterProfile();
    }
    
    private static void centerText(String text) {
        int consoleWidth = 45;
        int center = (consoleWidth - text.length()) / 2;
        for (int i = 0; i < center; i++) {
            System.out.print(" ");
        }
        System.out.println(text);
    }

    private static void clearConsole() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }

    public static boolean validateLogin(String username, String password) {
        return username.equals("admin") && password.equals("password");
    }
}

interface Customizable {
    public abstract void customizeCharacter();
}

interface Displayable {
    public abstract void displayCharacterProfile();
}

abstract class Attributes {
    public void initializeAttributes() {
    }
}

abstract class PhysicalAttributes extends Attributes {
    private String gender;
    private String pronounce;
    private String bodyType;
    private double height;
    private String skinColor;
    private String skinMarks;
    private String hairColor;
    private String hairStyle;
    private String faceShape;
    private String eyeColor;
    private String mouthShape;
    private String noseShape;
    private String beard;
    private String breastSize;
    private String tattoos;
    private String piercing;

    public PhysicalAttributes() {
        super();
    }

    public void initializeAttributes(String gender) {

    }

    public void initializeAttributes(String bodyType, double height, String skinColor,
            String skinMarks, String hairColor, String hairStyle, String faceShape) {

    }

    public void initializeAttributes(String eyeColor, String mouthShape, String noseShape, String beard,
            String breastSize, String tattoos, String piercing) {

    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setPronounce(String pronounce) {
        this.pronounce = pronounce;
    }

    public void setBodyType(String bodyType) {
        this.bodyType = bodyType;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public void setSkinColor(String skinColor) {
        this.skinColor = skinColor;
    }

    public void setSkinMarks(String skinMarks) {
        this.skinMarks = skinMarks;
    }

    public void setHairColor(String hairColor) {
        this.hairColor = hairColor;
    }

    public void setHairStyle(String hairStyle) {
        this.hairStyle = hairStyle;
    }

    public void setFaceShape(String faceShape) {
        this.faceShape = faceShape;
    }

    public void setEyeColor(String eyeColor) {
        this.eyeColor = eyeColor;
    }

    public void setMouthShape(String mouthShape) {
        this.mouthShape = mouthShape;
    }

    public void setNoseShape(String noseShape) {
        this.noseShape = noseShape;
    }

    public void setBeard(String beard) {
        this.beard = beard;
    }

    public void setBreastSize(String breastSize) {
        this.breastSize = breastSize;
    }

    public void setTattoos(String tattoos) {
        this.tattoos = tattoos;
    }

    public void setPiercing(String piercing) {
        this.piercing = piercing;
    }

    public String getGender() {
        return gender;
    }

    public String getPronounce() {
        return pronounce;
    }

    public String getBodyType() {
        return bodyType;
    }

    public double getHeight() {
        return height;
    }

    public String getSkinColor() {
        return skinColor;
    }

    public String getSkinMarks() {
        return skinMarks;
    }

    public String getHairColor() {
        return hairColor;
    }

    public String getHairStyle() {
        return hairStyle;
    }

    public String getFaceShape() {
        return faceShape;
    }

    public String getEyeColor() {
        return eyeColor;
    }

    public String getMouthShape() {
        return mouthShape;
    }

    public String getNoseShape() {
        return noseShape;
    }

    public String getBeard() {
        return beard;
    }

    public String getBreastSize() {
        return breastSize;
    }

    public String getTattoos() {
        return tattoos;
    }

    public String getPiercing() {
        return piercing;
    }
}

abstract class ClothingAttributes extends PhysicalAttributes {
    private String outfit;
    private String headgear;
    private String eyewear;
    private String footwear;

    public ClothingAttributes() {
        super();

    }

    public void initializeAttributes(String outfit, String headgear, String eyewear, String footwear) {

    }

    public void setOutfit(String outfit) {
        this.outfit = outfit;
    }

    public void setHeadgear(String headgear) {
        this.headgear = headgear;
    }

    public void setEyewear(String eyewear) {
        this.eyewear = eyewear;
    }

    public void setFootwear(String footwear) {
        this.footwear = footwear;
    }

    public String getOutfit() {
        return outfit;
    }

    public String getHeadgear() {
        return headgear;
    }

    public String getEyewear() {
        return eyewear;
    }

    public String getFootwear() {
        return footwear;
    }
}

abstract class PersonalityAttributes extends ClothingAttributes {
    private String companion;
    private String lifestyle;
    private String jewelry;
    private String personality;
    private String aspirations;
    private Boolean status;
    private String nickname;
    private String town;

    public PersonalityAttributes() {
        super();
    }

    public PersonalityAttributes(String companion, String lifestyle, String jewelry, String personality) {

    }

    public PersonalityAttributes(String aspirations, Boolean status, String nickname, String town) {

    }

    public void setCompanion(String companion) {
        this.companion = companion;
    }

    public void setLifestyle(String lifestyle) {
        this.lifestyle = lifestyle;
    }

    public void setJewelry(String jewelry) {
        this.jewelry = jewelry;
    }

    public void setPersonality(String personality) {
        this.personality = personality;
    }

    public void setAspirations(String aspirations) {
        if ("Other".equalsIgnoreCase(aspirations)) {

        } else {
            this.aspirations = aspirations;
        }
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public void setTown(String town) {
        this.town = town;
    }

    public String getCompanion() {
        return companion;
    }

    public String getLifestyle() {
        return lifestyle;
    }

    public String getJewelry() {
        return jewelry;
    }

    public String getPersonality() {
        return personality;
    }

    public String getAspirations() {
        return aspirations;
    }

    public Boolean hasStatus() {
        return status;
    }

    public String getNickname() {
        return nickname;
    }

    public String getTown() {
        return town;
    }
}

class WazzLyfSimClass extends PersonalityAttributes implements Customizable, Displayable {

    Scanner scanner = new Scanner(System.in);

    @Override
    public void displayCharacterProfile() {

        System.out.println("\n==============================================");
        System.out.println("   ***       CHARACTER DESIGN         ***   ");
        System.out.println("==============================================");

        if (getGender() != null) {
            System.out.println("Gender: " + getGender());
        } else {
            System.out.println("Gender: Not specified");
        }

        System.out.println("Pronounce: " + getPronounce());

        System.out.println("\n==============================================");
        System.out.println("   ***            PHYSICAL         ***   ");
        System.out.println("==============================================");

        System.out.println("Body Type: " + getBodyType());

        if (getGender() != null && getGender().equalsIgnoreCase("Male")) {
            if (getBeard() != null) {
                System.out.println("Beard: " + getBeard());
            }
        }

        if (getGender() != null && getGender().equalsIgnoreCase("Female")) {
            if (getBreastSize() != null) {
                System.out.println("Breast Size: " + getBreastSize());
            } 
        }

        System.out.println("Height: " + getHeight() + " % ");
        System.out.println("Skin Color: " + getSkinColor());
        System.out.println("Skin Marks: " + getSkinMarks());
        System.out.println("Hair Color: " + getHairColor());
        System.out.println("Hair Style: " + getHairStyle());
        System.out.println("Face Shape: " + getFaceShape());
        System.out.println("Eye Color: " + getEyeColor());
        System.out.println("Mouth Shape: " + getMouthShape());
        System.out.println("Nose Shape: " + getNoseShape());

        System.out.println("\n==============================================");
        System.out.println("    ***            FASHION            ***   ");
        System.out.println("==============================================");

        System.out.println("Tattoos: " + getTattoos());
        System.out.println("Piercing: " + getPiercing());
        System.out.println("Outfit: " + getOutfit());
        System.out.println("Headgear: " + getHeadgear());
        System.out.println("Eyewear: " + getEyewear());
        System.out.println("Footwear: " + getFootwear());
        System.out.println("Jewelry: " + getJewelry());

        System.out.println("\n==============================================");
        System.out.println("   ***            PERSONAL            ***   ");
        System.out.println("==============================================");

        System.out.println("Companion: " + getCompanion());
        System.out.println("Lifestyle: " + getLifestyle());
        System.out.println("Personality: " + getPersonality());
        System.out.println("Aspirations: " + getAspirations());
        System.out.println("Civil Status: " + (hasStatus() ? "Married" : "Single"));

        displayTownStory(getTown());

    }

    @Override
    public void customizeCharacter() {

        System.out.println("\n==============================================");
        System.out.println("   ***       CHARACTER DESIGNER         ***   ");
        System.out.println("==============================================");

        String gender = getUserChoice("Gender", "Male", "Female");
        setGender(gender);

        String pronounce = getUserChoice("Pronounce", "He/Him", "She/her", "They/Them", "None Specified");
        setPronounce(pronounce);

        System.out.println("\n==============================================");
        System.out.println("         ***       PHYSICAL        ***   ");
        System.out.println("==============================================");

        if ("Male".equalsIgnoreCase(getGender())) {
            setBodyType(getUserChoice("Body Type", "Bulk", "Thin", "Fat", "Cut", "Slim"));
        } else if ("Female".equalsIgnoreCase(getGender())) {
            setBodyType(getUserChoice("Body Type", "Sexy", "Thin", "Fat", "Thick", "Slim"));
        }

        String heightInput = getUserChoice("Height", "40%", "70%", "100%", "120%");
        double height = Double.parseDouble(heightInput.replaceAll("[^\\d.]", ""));
        setHeight(height);

        setSkinColor(getUserChoice("Skin Color", "Dark", "Tan", "White", "Brown", "Pinkish"));
        setSkinMarks(getUserChoice("Skin Marks", "Scars", "Moles", "Freckles"));

        setHairColor(getUserChoice("Hair Color", "Black", "Blonde", "Redhead", "White", "Grey"));
        setHairStyle(getUserChoice("Hair Style", "Bald", "Long", "Spiky", "Short", "Curly"));
        setFaceShape(getUserChoice("Face Shape", "Round", "Oval", "Heart", "Long", "Square"));
        setEyeColor(getUserChoice("Eye Color", "Blue", "Brown", "Green", "Grey", "Black"));
        setMouthShape(getUserChoice("Mouth Shape", "Wide", "Thin", "Full Lips", "Heart"));
        setNoseShape(getUserChoice("Nose Shape", "Straight", "Snub", "Hawk", "Greek", "Roman"));

        if ("Male".equalsIgnoreCase(getGender())) {
            setBeard(getUserChoice("Beard", "Oval", "Full", "Round", "Heart", "Diamond"));
        } else if ("Female".equalsIgnoreCase(getGender())) {
            setBreastSize(getUserChoice("Breast Size", "Small", "Medium", "Large"));
        }

        System.out.println("\n==============================================");
        System.out.println("   ***         CLOTHING/FASHION         ***   ");
        System.out.println("==============================================");

        setTattoos(getUserChoice("Tattoos", "Leg", "Arms", "Neck", "Back", "Face", "None"));
        setPiercing(getUserChoice("Piercing", "Eyebrows", "Lips", "Ears", "Nose", "Belly", "None"));

        if ("Male".equalsIgnoreCase(getGender())) {
            setOutfit(getUserChoice("Outfit", "Streetwear", "Suit", "Summer", "Korean Outfit", "Rugged"));
        } else if ("Female".equalsIgnoreCase(getGender())) {
            setOutfit(getUserChoice("Outfit", "Casual", "Dress", "Summer", "Gothic", "Blouse"));
        }

        setHeadgear(getUserChoice("Headgear", "Cap", "Cowboy Hat", "Hair Crown", "Beanie", "None"));
        setEyewear(getUserChoice("Eyewear", "Sunglasses", "Eyeglasses", "None"));

        if ("Male".equalsIgnoreCase(getGender())) {
            setFootwear(getUserChoice("Footwear", "Leather Shoes", "Sandals", "Sneakers", "Sports", "Boots"));
        } else if ("Female".equalsIgnoreCase(getGender())) {
            setFootwear(getUserChoice("Footwear", "Dress Shoes", "Sandals", "Sneakers", "Heels", "Boots"));
        }

        setJewelry(getUserChoice("Jewelry", "Necklace", "Earrings", "Bracelets", "Ring", "Watch", "None"));

        System.out.println("\n==============================================");
        System.out.println("        ***        PERSONAL        ***  ");
        System.out.println("==============================================");

        setCompanion(getUserChoice("Companion (pets)", "Cat", "Dog", "Bird", "Rabbit", "None"));
        setLifestyle(getUserChoice("Lifestyle", "Rich", "Poor", "Middle Class"));

        setPersonality(getUserChoice("Personality", "Introvert", "Extrovert", "Psychopath", "Ambivert"));
        String selectedAspiration = getUserChoice("Aspiration", "Lawyer", "Doctor", "Chef", "Pilot", "Army", "Other");
        String customAspiration;
        
    do {
        if ("Other".equalsIgnoreCase(selectedAspiration)) {
            System.out.print("\nEnter your custom aspiration: ");
            customAspiration = scanner.nextLine();
            setAspirations(customAspiration);
            if (customAspiration.isEmpty()) {
            System.out.print("Please Don't Skip !!!\n");
            }
        } else {
            setAspirations(selectedAspiration);
            break;
        }
    }while (customAspiration.isEmpty());
    
        String town = getUserChoice("Where Do You Want to Live?", "Maximus", "Gabusan", "Central Key");
        setTown(town);

        setStatus(getYesOrNoAnswer("\nAre you married?"));

        if (getYesOrNoAnswer("\nAre you finish customizing?")) {

            System.out.println("Character customization completed!");

        } else {

            System.out.println("OK! Start Again");
            customizeCharacter();
        }
    }

    private void displayTownStory(String town) {

        System.out.println("\n==============================================");
        System.out.println("            TOWN STORY OF " + getTown());
        System.out.println("==============================================");

        switch (getTown()) {
            case "Maximus":
                
                 System.out.println("""
                 In the heart of Maximus, a community flourishes
                 around the diligent efforts of its farmers. Day in
                 and day out, they work the fertile lands, particularly
                 cultivating rice, a staple of the local diet. The
                 rhythm of their toil echoes through the fields,
                 creating a symbiotic dance between the farmers and
                 the earth they tend to with unwavering dedication.
                 Local companies act as crucial links, gathering and
                 distributing the harvest to sustain both the town's
                 economy and the livelihoods of its people.
                 
                 This industrious landscape is not devoid of joy and
                 connection. Harvest festivals become cherished occasions
                 where the community unites to celebrate the fruits of
                 their collective labor. Music, dance, and shared feasts
                 punctuate these moments, emphasizing not only the abundance
                 of the harvest but also the resilience and unity that
                 define life in Maximus. In the simple act of tending
                 to their crops and coming together in celebration, the
                 people of (town name) find fulfillment in the shared rhythm
                 of their agricultural existence.
                 """);
                 
                System.out.println("Enjoy the scenic views and vibrant community events.");
                break;
            case "Gabusan":
                
                 System.out.println("""
                 Nestled along the azure coastline, Gabusan embodies
                 tranquility with the soothing lull of waves against
                 the shore and powdery white sand, attracting those
                 yearning for a peaceful escape. Enchanted by this
                 coastal paradise, affluent residents have chosen
                 to call it home, adorning the landscape with elegant
                 mansions that gracefully complementthe natural beauty.
                 
                 Beneath the crystal-clear waters, the town thrives on
                 a vibrant marine life, providing a bountiful catch
                 for skilled local fishermen. Their artistry in
                 navigating the waters sustains the community, as the
                 variety of fish finds its way to bustling local
                 markets. Guiding this idyllic haven is the Mayor,
                 a steward committed to maintaining the delicate
                 balance between progress and preservation. Through
                 thoughtful management and community-driven initiatives,
                 the town remains prosperous, and its waters pristine.
                 As the sun sets over Gabusan, residents gather to share
                 stories and laughter, a testament to the harmonious
                 coexistence of nature's gifts and responsible human stewardship.
                 """); 
                 
                System.out.println("\nNavigate through the bustling streets and pursue your dreams.");
                break;
            case "Central Key":
                
                 System.out.println("""
                 In the daylight hours, Central Key bustles with the
                 vibrant energy of urban life. Professionals swarm the
                 towering skyscrapers, defining the cityscape as they
                 commute to work. The bustling streets below host a
                 plethora of shops, cafes, and businesses catering to
                 the diverse needs of the urban population. Here, people
                 from different walks of life converge, weaving a vibrant
                 tapestry of cultures and experiences that characterize
                 the city's dynamic daytime atmosphere.
                  
                 As night falls, Central Key undergoes a remarkable
                 transformation. The city's affluent establishments
                 illuminate the night sky with a dazzling display of
                 lights, turning it into a sparkling spectacle. The
                 nocturnal hours bring a different energy, as the
                 nightlife awakens with entertainment venues, restaurants,
                 and exclusive clubs that cater to the elite. However,
                 amid this affluence and glamour, a stark contrast persists.
                 In the quieter corners of the town, makeshift dwellings
                 serve as poignant reminders of the less privileged.
                 Squatters navigate the challenges of urban life, coexisting
                 with the opulence that surrounds them. This duality paints
                 a complex picture of Central Key, where the stark divide
                 between the wealthy and the underprivileged is an inherent
                 part of the city's narrative.
                  """);
                 
                System.out.println("\nEmbark on a magical journey and embrace the extraordinary.");
                break;
            default:
                System.out.println("Welcome to an unknown land. Create your own story!");
        }
    }

    private boolean getYesOrNoAnswer(String question) {
        String answer;
        Scanner scanner = new Scanner(System.in);

        do {
            System.out.print(question + " (Y/N): ");
            answer = scanner.nextLine();
            if (!answer.equalsIgnoreCase("Y") && !answer.equalsIgnoreCase("N")) {
                System.out.println("Invalid input. Please enter 'Y' or 'N'.");
            }
        } while (!answer.equalsIgnoreCase("Y") && !answer.equalsIgnoreCase("N"));

        return answer.equalsIgnoreCase("Y");

    }

    public String getUserChoice(String feature, String... options) {
    String choice;

    do {
        try {
            System.out.println("\nChoose " + feature + ":");
            for (int i = 0; i < options.length; i++) {
                System.out.println((i + 1) + ". " + options[i]);
            }
            System.out.print("Enter the number of your choice: ");
            int userChoice = scanner.nextInt();
            scanner.nextLine();

            if (userChoice >= 1 && userChoice <= options.length) {
                choice = options[userChoice - 1];
                break;
            } else {
                System.out.println("Invalid choice. Please try again.");
            }
        } catch (java.util.InputMismatchException e) {
            System.out.println("Invalid input. Please enter a number.");
            scanner.nextLine();
        }
    } while (true);

    return choice;
  }

}

