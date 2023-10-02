package mini.mini;

//    private static int loggedInUser; // Stores the currently logged-in user
//
//    // Set the currently logged-in user
////    public static void setLoggedInUser(UserLoginController user) {
////        loggedInUser = user;
////    }
//
//    // Get the currently logged-in user's ID
//
////    CurrentUser.setLoggedInUserId(userId);
//    public static void setLoggedInUser(int userId) {
//        loggedInUser = userId;
//    }
//    public static int getCurrentUserId() {
//        if (loggedInUser != 0) {
//            return CurrentUser.getCurrentUserId();
//            // Replace with the appropriate method to get the user's ID
//        }
//        return -1; // Return a default value or handle the case when no user is logged in
//    }
//        private static UserLoginController loggedInUser; // Stores the currently logged-in user
//
//        public static void login(UserLoginController user) {
//            loggedInUser = user;
//        }
//
//        public static void logout() {
//            loggedInUser = null;
//        }
//
//        public static UserLoginController getLoggedInUser() {
//            return loggedInUser;
//        }


    public class AuthService {
        private static AuthService instance;
        private int loggedInUserId = -1; // Default value when no user is logged in

        private AuthService() {
            // Private constructor to prevent direct instantiation
        }

        public static AuthService getInstance() {
            if (instance == null) {
                instance = new AuthService();
            }
            return instance;
        }

        public void login(int userId) {
            loggedInUserId = userId;
        }

        public void logout() {
            loggedInUserId = -1;
        }

        public int getLoggedInUserId() {
            return loggedInUserId;
        }
    }




