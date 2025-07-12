@Composable
fun ServiceDetailScreen(serviceId: Int?) {
    // Mock de datos (luego reemplazar con ViewModel)
    val service = Service(serviceId ?: 0, "Fiesta Temática", "$200", "Más detalles aquí...")

    Column(modifier = Modifier.padding(16.dp)) {
        Text(service.name, style = MaterialTheme.typography.h4)
        Text("Precio: ${service.price}", style = MaterialTheme.typography.body1)
        Spacer(modifier = Modifier.height(16.dp))
        Text(service.description)
    }
}