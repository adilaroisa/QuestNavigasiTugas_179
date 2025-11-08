package com.example.tugaspertemuan6.view



@Composable
fun HalamanHome(
    onMasukClick: () -> Unit
) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(dimensionResource(id = R.dimen.padding_medium)),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Card(
            modifier = Modifier.fillMaxSize(0.9f),
            colors = CardDefaults.cardColors(
                containerColor = colorResource(id = R.color.light_purple_bg)
            ),
            shape = MaterialTheme.shapes.large
        ) {
            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(vertical = dimensionResource(id = R.dimen.padding_xlarge)),
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.SpaceBetween
            ) {
                Text(
                    text = stringResource(id = R.string.selamat_datang),
                    fontSize = dimensionResource(id = R.dimen.font_size_header).value.sp,

                    fontWeight = FontWeight.SemiBold,
                    color = colorResource(id = R.color.dark_purple_text)
                )
                Spacer(modifier = Modifier.height(dimensionResource(id = R.dimen.spacer_xlarge)))

                Image(
                    painter = painterResource(id = R.drawable.welcome),
                    contentDescription = stringResource(id = R.string.logo_content_desc),
                    modifier = Modifier.size(dimensionResource(id = R.dimen.logo_size))
                )

                Spacer(modifier = Modifier.height(dimensionResource(id = R.dimen.spacer_xlarge)))

