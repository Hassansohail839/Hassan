const map = L.map('map').setView([41.3879, 2.1699], 8);
const emergencias = [
  {
    titulo: 'Incendio en Ribera d’Ebre',
    coords: [41.1456, 0.6381],
  },
  {
    titulo: 'Ola de calor en Tarragona',
    coords: [41.1189, 1.2445],
  },
  {
    titulo: 'Corte de luz en Eixample',
    coords: [41.3911, 2.1620],
  },
];
const lista = document.getElementById("lista-emergencias");
const marcadores = [];

emergencias.forEach((e) => {
  // Crear marcador en el mapa
  const marker = L.marker(e.coords)
    .addTo(map)
    .bindPopup(`<b>${e.titulo}</b>`);

  marcadores.push(marker);

  // Crear ítem en la lista
  const item = document.createElement("li");
  item.innerHTML = `<strong>${e.titulo}</strong><br><em>Haz clic para ver en el mapa</em>`;
  item.style.cursor = "pointer";
  item.style.padding = "0.5rem 0";

  // Al hacer clic en el ítem, centrar el mapa y abrir el popup
  item.addEventListener("click", () => {
    map.setView(e.coords, 11); // zoom opcional
    marker.openPopup();
  });

  lista.appendChild(item);
});
