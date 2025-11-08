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
        Column(
            modifier = Modifier
                .padding(isiRuang)
                .fillMaxSize()
                .padding(dimensionResource(id = R.dimen.padding_medium)),
            horizontalAlignment = Alignment.CenterHorizontally,
        ) {
            Card(
                modifier = Modifier.fillMaxWidth(0.9f),
                colors = CardDefaults.cardColors(containerColor = Color.White),
                shape = MaterialTheme.shapes.large,
                elevation = CardDefaults.cardElevation(
                    defaultElevation = dimensionResource(id = R.dimen.card_elevation)
                )
            ) {
                Column(
                    modifier = Modifier.padding(dimensionResource(id = R.dimen.padding_large)),
                    horizontalAlignment = Alignment.Start
                ) {
                    // NAMA LENGKAP
                    Text(
                        text = stringResource(id = R.string.label_nama_lengkap),
                        fontSize = dimensionResource(id = R.dimen.font_size_label).value.sp,
                        color = colorResource(id = R.color.grey_label)
                    )
                    OutlinedTextField(
                        value = nama,
                        onValueChange = { nama = it },
                        label = { Text(text = stringResource(id = R.string.placeholder_nama)) },
                        modifier = Modifier.fillMaxWidth(),
                        singleLine = true
                    )
                    Spacer(modifier = Modifier.height(dimensionResource(id = R.dimen.spacer_large)))

                    // JENIS KELAMIN
                    Text(
                        text = stringResource(id = R.string.label_jenis_kelamin),
                        fontSize = dimensionResource(id = R.dimen.font_size_label).value.sp,
                        color = colorResource(id = R.color.grey_label)
                    )
                    Row(modifier = Modifier.fillMaxWidth()) {
                        // Radio Laki-laki (Kode ditulis langsung)
                        Row(verticalAlignment = Alignment.CenterVertically) {
                            RadioButton(
                                selected = jenisKelamin == strLaki,
                                onClick = { jenisKelamin = strLaki }
                            )
                            Text(text = strLaki)
                        }
                        Spacer(modifier = Modifier.width(dimensionResource(id = R.dimen.spacer_medium)))
                        // Radio Perempuan (Kode ditulis langsung)
                        Row(verticalAlignment = Alignment.CenterVertically) {
                            RadioButton(
                                selected = jenisKelamin == strPerempuan,
                                onClick = { jenisKelamin = strPerempuan }
                            )
                            Text(text = strPerempuan)
                        }
                    }
                    Spacer(modifier = Modifier.height(dimensionResource(id = R.dimen.spacer_large)))

                    // STATUS PERKAWINAN
                    Text(
                        text = stringResource(id = R.string.label_status),
                        fontSize = dimensionResource(id = R.dimen.font_size_label).value.sp,
                        color = colorResource(id = R.color.grey_label)
                    )
                    Row(
                        modifier = Modifier.fillMaxWidth(),
                        horizontalArrangement = Arrangement.SpaceBetween
                    ) {
                        // Radio Janda (Kode ditulis langsung)
                        Row(verticalAlignment = Alignment.CenterVertically) {
                            RadioButton(
                                selected = statusPerkawinan == strJanda,
                                onClick = { statusPerkawinan = strJanda }
                            )
                            Text(text = strJanda)
                        }
                        // Radio Lajang
                        Row(verticalAlignment = Alignment.CenterVertically) {
                            RadioButton(
                                selected = statusPerkawinan == strLajang,
                                onClick = { statusPerkawinan = strLajang }
                            )
                            Text(text = strLajang)
                        }
                        // Radio Duda
                        Row(verticalAlignment = Alignment.CenterVertically) {
                            RadioButton(
                                selected = statusPerkawinan == strDuda,
                                onClick = { statusPerkawinan = strDuda }
                            )
                            Text(text = strDuda)
                        }
                    }
                    Spacer(modifier = Modifier.height(dimensionResource(id = R.dimen.spacer_large)))

