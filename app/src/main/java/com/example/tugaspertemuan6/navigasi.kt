package com.example.tugaspertemuan6




enum class Navigasi {
    Home,
    Formulirku,
    ListPeserta
}

@Composable
fun DataApp(
    navController: NavHostController = rememberNavController()
) {
    // TIDAK ADA STATE DI SINI

    Scaffold(modifier = Modifier.fillMaxSize()) { isiRuang ->
        NavHost(
            navController = navController,
            startDestination = Navigasi.Home.name,
            modifier = Modifier.padding(paddingValues = isiRuang)
        )