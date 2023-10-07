package mini.mini;

    public class AuthService {
        private static AuthService instance;
        private int loggedInUserId = -1; // Default value when no user is logged in

        private String loggedINUsername;
        private String loggedInUsername;

        private AuthService() {
            // Private constructor to prevent direct instantiation
        }

        public static AuthService getInstance() {
            if (instance == null) {
                instance = new AuthService();
            }
            return instance;
        }

        public void login(int userId, String loggedInUsername) {
            loggedInUserId = userId;
        }

        public void logout() {
            loggedInUserId = -1;
        }

        public int getLoggedInUserId() {
            return loggedInUserId;
        }


        public String getLoggedINUsername(){
                return loggedINUsername;
        }

        public String getLoggedInUsername() {
            return loggedINUsername;
        }

        public void setLoggedInUsername(String loggedInUsername) {
            this.loggedInUsername = loggedInUsername;
        }

    }



