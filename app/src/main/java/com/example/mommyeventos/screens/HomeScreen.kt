@Composable
fun HomeScreen(navController: NavController) {
    val services = listOf(
        Service(1, "Fiesta Temática", "$200", "Decoración y juegos temáticos"),
        Service(2, "Baby Shower", "$150", "Organización completa")
    )

    Column(modifier = Modifier.padding(16.dp)) {
        Text("Servicios", style = MaterialTheme.typography.h4)
        Spacer(modifier = Modifier.height(16.dp))
        LazyColumn {
            items(services) { service ->
                ServiceCard(service, navController)
            }
        }
    }
}

@Composable
fun ServiceCard(service: Service, navController: NavController) {
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .padding(8.dp)
            .clickable { navController.navigate("detail/${service.id}") },
        elevation = 4.dp
    ) {
        Column(modifier = Modifier.padding(16.dp)) {
            Text(service.name, style = MaterialTheme.typography.h6)
            Text(service.price, color = Color.Gray)
        }
    }
}