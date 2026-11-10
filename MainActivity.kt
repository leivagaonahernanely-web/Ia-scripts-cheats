Row(verticalAlignment = Alignment.CenterVertically) {
    Box(
        Modifier.size(10.dp).clip(CircleShape)
            .background(Color(0xFFC8C8D0))
    )
    Spacer(Modifier.width(10.dp))
    Text(
        "IAscriptsVanta",
        style = MaterialTheme.typography.titleMedium.copy(
            brush = Brush.linearGradient(
                listOf(Color(0xFFFFFFFF), Color(0xFF9A9AA6))
            ),
            fontWeight = FontWeight.Bold,
            letterSpacing = 0.5.sp
        )
    )
}
