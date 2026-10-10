package com.example.questtugaslayout

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.dimensionResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.sp

@Composable
fun QuestTugasLayout(modifier: Modifier = Modifier) {
    Column(
        modifier = modifier
            .fillMaxSize()
            .background(colorResource(R.color.background_page))
            .padding(
                horizontal = dimensionResource(
                    R.dimen.page_horizontal_padding
                )
            )
            .padding(
                top = dimensionResource(R.dimen.page_top_padding)
            ),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            text = stringResource(R.string.prodi),
            fontSize = dimensionResource(
                R.dimen.title_text_size
            ).value.sp,
            fontWeight = FontWeight.Bold,
            textAlign = TextAlign.Center
        )

        Spacer(
            modifier = Modifier.height(
                dimensionResource(R.dimen.title_bottom_spacing)
            )
        )

        Text(
            text = stringResource(R.string.univ),
            fontSize = dimensionResource(
                R.dimen.subtitle_text_size
            ).value.sp,
            fontWeight = FontWeight.Bold,
            textAlign = TextAlign.Center
        )

        Spacer(
            modifier = Modifier.height(
                dimensionResource(R.dimen.subtitle_bottom_spacing)
            )
        )

        Column(
            modifier = Modifier.fillMaxWidth(),
            verticalArrangement = Arrangement.spacedBy(
                dimensionResource(R.dimen.card_spacing)
            )
        ) {
            ProfileCard(
                nameResId = R.string.nama_1,
                phoneResId = R.string.telepon_1,
                addressResId = R.string.alamat_1,
                backgroundColorResId = R.color.card_iza,
                addressColorResId = R.color.text_iza_address,
                nameFontFamily = FontFamily.Cursive,
                nameFontWeight = FontWeight.Normal
            )

            ProfileCard(
                nameResId = R.string.nama_2,
                phoneResId = R.string.telepon_2,
                addressResId = R.string.alamat_2,
                backgroundColorResId = R.color.card_putri,
                nameFontFamily = FontFamily.Cursive,
                addressColorResId = R.color.text_address
            )

            ProfileCard(
                nameResId = R.string.nama_3,
                phoneResId = R.string.telepon_3,
                addressResId = R.string.alamat_3,
                backgroundColorResId = R.color.card_rara,
                addressColorResId = R.color.text_address
            )

            ProfileCard(
                nameResId = R.string.nama_4,
                phoneResId = R.string.telepon_4,
                addressResId = R.string.alamat_4,
                backgroundColorResId = R.color.card_salwa,
                addressColorResId = R.color.text_address
            )
        }

        Spacer(
            modifier = Modifier.weight(1f)
        )

        Text(
            text = stringResource(R.string.copyright),
            fontSize = dimensionResource(
                R.dimen.copyright_text_size
            ).value.sp,
            textAlign = TextAlign.Center,
            modifier = Modifier
                .fillMaxWidth()
                .padding(
                    bottom = dimensionResource(
                        R.dimen.copyright_bottom_padding
                    )
                )
        )
    }
}