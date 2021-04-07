/*     */ package lib;
/*     */ 
/*     */ import java.io.BufferedReader;
/*     */ import java.io.IOException;
/*     */ import java.io.InputStreamReader;
/*     */ 
/*     */ public class ConsoleIO
/*     */ {
/*     */   public static int promptForMenuSelection(String[] options, boolean withQuit) {
/*  10 */     BufferedReader ScannerSlayer = new BufferedReader(new InputStreamReader(System.in));
/*  11 */     int userChoice = 0;
/*  12 */     boolean menuloop = false;
/*     */     while (true) {
/*  14 */       System.out.println("Please select an option.");
/*  15 */       if (withQuit) {
/*  16 */         System.out.println("0) Quit");
/*     */       }
/*  18 */       for (int i = 0; i < options.length; i++) {
/*  19 */         System.out.println(String.valueOf(i + 1) + ") " + options[i]);
/*     */       }
/*  21 */       menuloop = false;
/*     */       try {
/*  23 */         String choiceIN = ScannerSlayer.readLine();
/*     */         try {
/*  25 */           userChoice = Integer.parseInt(choiceIN);
/*  26 */           if (userChoice > options.length || userChoice < 0) {
/*  27 */             System.out.println("Invalid option, please try again.");
/*  28 */             menuloop = true;
/*     */           } 
/*  30 */         } catch (NumberFormatException e) {
/*  31 */           System.out.println("Invalid option, please try again.");
/*  32 */           menuloop = true;
/*     */         } 
/*  34 */       } catch (IOException e) {
/*  35 */         e.printStackTrace();
/*     */       } 
/*  37 */       if (!menuloop)
/*  38 */         return userChoice; 
/*     */     } 
/*     */   }
/*     */   public static boolean promptForBool(String prompt, String trueString, String falseString) {
/*  42 */     BufferedReader ScannerSlayer = new BufferedReader(new InputStreamReader(System.in));
/*  43 */     boolean returnBool = true;
/*  44 */     boolean boolloop = true;
/*     */     while (true) {
/*  46 */       String boolIN = null;
/*  47 */       System.out.println(prompt);
/*     */       try {
/*  49 */         boolIN = ScannerSlayer.readLine();
/*  50 */       } catch (IOException e) {
/*  51 */         e.printStackTrace();
/*     */       } 
/*  53 */       if (boolIN.equalsIgnoreCase(trueString)) {
/*  54 */         boolloop = false;
/*  55 */       } else if (boolIN.equalsIgnoreCase(falseString)) {
/*  56 */         returnBool = false;
/*  57 */         boolloop = false;
/*     */       } else {
/*  59 */         System.out.println("Invalid input. Please enter " + trueString + " or " + falseString + ".");
/*     */       } 
/*  61 */       if (!boolloop)
/*  62 */         return returnBool; 
/*     */     } 
/*     */   }
/*     */   public static byte promptForByte(String prompt, byte min, byte max) {
/*  66 */     BufferedReader ScannerSlayer = new BufferedReader(new InputStreamReader(System.in));
/*  67 */     byte returnByte = 0;
/*  68 */     boolean byteloop = true;
/*     */     while (true) {
/*  70 */       System.out.println(prompt);
/*     */       
/*     */       try {
/*  73 */         String byteIN = ScannerSlayer.readLine();
/*     */         try {
/*  75 */           returnByte = Byte.parseByte(byteIN);
/*  76 */           if (returnByte > max || returnByte < min) {
/*  77 */             System.out.println("Invalid, please enter a valid input.");
/*  78 */             byteloop = true;
/*     */           } else {
/*  80 */             byteloop = false;
/*     */           } 
/*  82 */         } catch (NumberFormatException e) {
/*  83 */           System.out.println("Invalid, please enter a valid input.");
/*     */         } 
/*  85 */       } catch (IOException e) {
/*  86 */         e.printStackTrace();
/*     */       } 
/*  88 */       if (!byteloop)
/*  89 */         return returnByte; 
/*     */     } 
/*     */   }
/*     */   public static short promptForShort(String prompt, short min, short max) {
/*  93 */     BufferedReader ScannerSlayer = new BufferedReader(new InputStreamReader(System.in));
/*  94 */     short returnShort = 0;
/*  95 */     boolean shortloop = true;
/*     */     while (true) {
/*  97 */       System.out.println(prompt);
/*     */       
/*     */       try {
/* 100 */         String shortIN = ScannerSlayer.readLine();
/*     */         try {
/* 102 */           returnShort = Short.parseShort(shortIN);
/* 103 */           if (returnShort > max || returnShort < min) {
/* 104 */             System.out.println("Invalid, please enter a valid input.");
/* 105 */             shortloop = true;
/*     */           } else {
/* 107 */             shortloop = false;
/*     */           } 
/* 109 */         } catch (NumberFormatException e) {
/* 110 */           System.out.println("Invalid, please enter a valid input.");
/*     */         } 
/* 112 */       } catch (IOException e) {
/* 113 */         e.printStackTrace();
/*     */       } 
/* 115 */       if (!shortloop)
/* 116 */         return returnShort; 
/*     */     } 
/*     */   }
/*     */   public static int promptForInt(String prompt, int min, int max) {
/* 120 */     BufferedReader ScannerSlayer = new BufferedReader(new InputStreamReader(System.in));
/* 121 */     int returnInt = 0;
/* 122 */     boolean intloop = true;
/*     */     while (true) {
/* 124 */       System.out.println(prompt);
/*     */       
/*     */       try {
/* 127 */         String intIN = ScannerSlayer.readLine();
/*     */         try {
/* 129 */           returnInt = Integer.parseInt(intIN);
/* 130 */           if (returnInt > max || returnInt < min) {
/* 131 */             System.out.println("Invalid, please enter a valid input.");
/* 132 */             intloop = true;
/*     */           } else {
/* 134 */             intloop = false;
/*     */           } 
/* 136 */         } catch (NumberFormatException e) {
/* 137 */           System.out.println("Invalid, please enter a valid input.");
/*     */         } 
/* 139 */       } catch (IOException e) {
/* 140 */         e.printStackTrace();
/*     */       } 
/* 142 */       if (!intloop)
/* 143 */         return returnInt; 
/*     */     } 
/*     */   }
/*     */   public static long promptForLong(String prompt, long min, long max) {
/* 147 */     BufferedReader ScannerSlayer = new BufferedReader(new InputStreamReader(System.in));
/* 148 */     long returnLong = 0L;
/* 149 */     boolean longloop = true;
/*     */     while (true) {
/* 151 */       System.out.println(prompt);
/*     */       
/*     */       try {
/* 154 */         String longIN = ScannerSlayer.readLine();
/*     */         try {
/* 156 */           returnLong = Long.parseLong(longIN);
/* 157 */           if (returnLong > max || returnLong < min) {
/* 158 */             System.out.println("Invalid, please enter a valid input.");
/* 159 */             longloop = true;
/*     */           } else {
/* 161 */             longloop = false;
/*     */           } 
/* 163 */         } catch (NumberFormatException e) {
/* 164 */           System.out.println("Invalid, please enter a valid input.");
/*     */         } 
/* 166 */       } catch (IOException e) {
/* 167 */         e.printStackTrace();
/*     */       } 
/* 169 */       if (!longloop)
/* 170 */         return returnLong; 
/*     */     } 
/*     */   }
/*     */   public static float promptForFloat(String prompt, float min, float max) {
/* 174 */     BufferedReader ScannerSlayer = new BufferedReader(new InputStreamReader(System.in));
/* 175 */     float returnFloat = 0.0F;
/* 176 */     boolean floatloop = true;
/*     */     while (true) {
/* 178 */       System.out.println(prompt);
/*     */       
/*     */       try {
/* 181 */         String floatIN = ScannerSlayer.readLine();
/*     */         try {
/* 183 */           returnFloat = Float.parseFloat(floatIN);
/* 184 */           if (returnFloat > max || returnFloat < min) {
/* 185 */             System.out.println("Invalid, please enter a valid input.");
/* 186 */             floatloop = true;
/*     */           } else {
/* 188 */             floatloop = false;
/*     */           } 
/* 190 */         } catch (NumberFormatException e) {
/* 191 */           System.out.println("Invalid, please enter a valid input.");
/*     */         } 
/* 193 */       } catch (IOException e) {
/* 194 */         e.printStackTrace();
/*     */       } 
/* 196 */       if (!floatloop)
/* 197 */         return returnFloat; 
/*     */     } 
/*     */   }
/*     */   public static double promptForDouble(String prompt, double min, double max) {
/* 201 */     BufferedReader ScannerSlayer = new BufferedReader(new InputStreamReader(System.in));
/* 202 */     double returnDouble = 0.0D;
/* 203 */     boolean doubleloop = true;
/*     */     while (true) {
/* 205 */       System.out.println(prompt);
/*     */       
/*     */       try {
/* 208 */         String doubleIN = ScannerSlayer.readLine();
/*     */         try {
/* 210 */           returnDouble = Double.parseDouble(doubleIN);
/* 211 */           if (returnDouble > max || returnDouble < min) {
/* 212 */             System.out.println("Invalid, please enter a valid input.");
/* 213 */             doubleloop = true;
/*     */           } else {
/* 215 */             doubleloop = false;
/*     */           } 
/* 217 */         } catch (NumberFormatException e) {
/* 218 */           System.out.println("Invalid, please enter a valid input.");
/*     */         } 
/* 220 */       } catch (IOException e) {
/* 221 */         e.printStackTrace();
/*     */       } 
/* 223 */       if (!doubleloop)
/* 224 */         return returnDouble; 
/*     */     } 
/*     */   }
/*     */   public static String promptForInput(String prompt, boolean allowEmpty) {
/* 228 */     BufferedReader ScannerSlayer = new BufferedReader(new InputStreamReader(System.in));
/* 229 */     String returnInput = null;
/* 230 */     boolean inputloop = false;
/*     */     while (true) {
/* 232 */       System.out.println(prompt);
/*     */       try {
/* 234 */         returnInput = ScannerSlayer.readLine();
/* 235 */       } catch (IOException e) {
/* 236 */         e.printStackTrace();
/*     */       } 
/* 238 */       if (!allowEmpty) {
/* 239 */         if (returnInput.equals(null)) {
/* 240 */           System.out.println("Invalid input, please try again.");
/* 241 */           inputloop = true;
/* 242 */         } else if (returnInput.equals("")) {
/* 243 */           System.out.println("Invalid input, please try again.");
/* 244 */           inputloop = true;
/*     */         } 
/*     */       }
/* 247 */       if (!returnInput.equals("")) {
/* 248 */         inputloop = false;
/*     */       }
/* 250 */       if (!inputloop)
/* 251 */         return returnInput; 
/*     */     } 
/*     */   }
/*     */   public static char promptForChar(String prompt, char min, char max) {
/* 255 */     BufferedReader ScannerSlayer = new BufferedReader(new InputStreamReader(System.in));
/* 256 */     char returnChar = ' ';
/* 257 */     boolean charloop = false;
/*     */     while (true) {
/* 259 */       System.out.println(prompt);
/*     */       
/*     */       try {
/* 262 */         String charIN = ScannerSlayer.readLine();
/*     */         try {
/* 264 */           returnChar = charIN.charAt(0);
/* 265 */           if (returnChar > max || returnChar < min) {
/* 266 */             System.out.println("Invalid, please enter a valid input.");
/* 267 */             charloop = true;
/*     */           } 
/* 269 */         } catch (NumberFormatException e) {
/* 270 */           System.out.println("Invalid, please enter a valid input.");
/*     */         } 
/* 272 */       } catch (IOException e) {
/* 273 */         e.printStackTrace();
/*     */       } 
/* 275 */       if (returnChar <= max && returnChar >= min) {
/* 276 */         charloop = false;
/*     */       }
/* 278 */       if (!charloop)
/* 279 */         return returnChar; 
/*     */     } 
/*     */   }
/*     */ }


/* Location:              C:\Users\ACE\Documents\bleh\JenkinsTest-main\LootGen2, ElectricBugaloo\WeberG_ConsoleIO.jar!\lib\ConsoleIO.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */