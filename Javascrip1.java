// Seleciona todas as gavetas
const drawerTabs = document.querySelectorAll('.drawer-tab');

// Adiciona evento de clique para cada botão de gaveta
drawerTabs.forEach(drawerTab => {
    const tabButton = drawerTab.querySelector('.tab-button');
    
    tabButton.addEventListener('click', () => {
        // Fecha todas as outras gavetas
        drawerTabs.forEach(otherTab => {
            if (otherTab !== drawerTab && otherTab.classList.contains('open')) {
                otherTab.classList.remove('open');
            }
        });
        
        // Abre/fecha a gaveta atual
        drawerTab.classList.toggle('open');
    });
});

// Fecha as gavetas quando clicar fora delas
document.addEventListener('click', (e) => {
    drawerTabs.forEach(drawerTab => {
        if (!drawerTab.contains(e.target) && drawerTab.classList.contains('open')) {
            drawerTab.classList.remove('open');
        }
    });
});