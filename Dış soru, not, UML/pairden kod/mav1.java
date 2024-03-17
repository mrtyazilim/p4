

    private static void writeToFile(String fileName, String[] content) {
        try {
            PrintWriter writer = new PrintWriter(fileName);
            for (String line : content) {
                writer.println(line);
            }
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static String[] process() {
        String[] str;
        String[] str2;
        String gender;
        String newLine = null;
        try {
            Scanner input = new Scanner(new File("StudentList1.txt"));

            int count = 0;

            while (input.hasNextLine()) {
                input.nextLine();
                count++;
            }
            str = new String[count];
            input = new Scanner(new File("StudentList1.txt"));

            for (int i = 0; i < str.length; i++) {
                String fullName = input.nextLine();

                str2 = fullName.split("\\|");
                if (str2.length == 2) {
                    gender = str2[1].trim();
                    if (gender.equals("E")) {
                        gender = "Bey";
                    } else if(gender.equals("K")){
                        gender = "Hanım";
                    }else {
                        gender = "Cinsiyet Belirlenemedi.";
                    }
                    newLine = str2[0] + " " + gender;
                }
                str[i] = newLine;
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        return str;
    }
}







