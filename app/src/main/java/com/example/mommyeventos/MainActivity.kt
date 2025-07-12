class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MommyEventosTheme { // Usa tu tema personalizado
                AppNavigation()
            }
        }
    }
}