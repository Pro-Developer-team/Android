import android.content.Context
import android.content.SharedPreferences

class PreferencesManager(context: Context) {
    private val sharedPreferences: SharedPreferences = context.getSharedPreferences(PREFS_NAME, Context.MODE_PRIVATE)

    companion object {
        private const val PREFS_NAME = "my_preferences"
        private const val KEY_USERNAME = "username"
        private const val KEY_IS_LOGGED_IN = "is_logged_in"
    }

    // Save username
    fun saveUsername(username: String) {
        with(sharedPreferences.edit()) {
            putString(KEY_USERNAME, username)
            apply() // or commit() for synchronous saving
        }
    }

    // Retrieve username
    fun getUsername(): String? {
        return sharedPreferences.getString(KEY_USERNAME, null)
    }

    // Save login status
    fun saveLoginStatus(isLoggedIn: Boolean) {
        with(sharedPreferences.edit()) {
            putBoolean(KEY_IS_LOGGED_IN, isLoggedIn)
            apply()
        }
    }

    // Retrieve login status
    fun isLoggedIn(): Boolean {
        return sharedPreferences.getBoolean(KEY_IS_LOGGED_IN, false)
    }

    // Clear all preferences
    fun clearPreferences() {
        with(sharedPreferences.edit()) {
            clear()
            apply()
        }
    }
}
