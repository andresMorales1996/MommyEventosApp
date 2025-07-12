@Composable
fun AppNavigation() {
    val navController = rememberNavController()
    NavHost(navController, startDestination = "home") {
        composable("home") { HomeScreen(navController) }
        composable("detail/{serviceId}") { backStackEntry ->
            ServiceDetailScreen(backStackEntry.arguments?.getString("serviceId")?.toIntOrNull())
        }
    }
}