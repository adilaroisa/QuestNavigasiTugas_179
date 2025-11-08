package com.example.tugaspertemuan6.view



@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun FormIsian(
    onBackClick: () -> Unit,
    onBerandaClick: () -> Unit
) {
    // === STATE DISIMPAN DI SINI ===
    var nama by remember { mutableStateOf("") }
    var jenisKelamin by remember { mutableStateOf("") }
    var statusPerkawinan by remember { mutableStateOf("") }
    var alamat by remember { mutableStateOf("") }
    var showDialog by remember { mutableStateOf(false) }


    // Ambil string dari resource
    val strLaki = stringResource(id = R.string.jk_laki)
    val strPerempuan = stringResource(id = R.string.jk_perempuan)
    val strJanda = stringResource(id = R.string.status_janda)
    val strLajang = stringResource(id = R.string.status_lajang)
    val strDuda = stringResource(id = R.string.status_duda)

    Scaffold(
        modifier = Modifier,
        topBar = {
            TopAppBar(
                title = {
                    Text(
                        text = stringResource(id = R.string.form_title),
                        color = Color.Black,
                        fontWeight = FontWeight.SemiBold
                    )
                },
                colors = TopAppBarDefaults.mediumTopAppBarColors(
                    containerColor = Color.Transparent
                )
            )
        }
    ) { isiRuang ->
