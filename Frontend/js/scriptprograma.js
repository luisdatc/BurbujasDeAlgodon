function activateNavigation() {
    const sections = document.querySelectorAll(".section");
    const navContainer = document.createElement("nav2");
    const navItems = Array.from(sections).map((section) => {
      return `
                      <div class="nav-item1" data-for-section="${section.id}">
                          <a href="#${section.id}" class="nav-link1"></a>
                          <span class="nav-label1">${section.dataset.label}</span>
                      </div>
                  `;
    });
  
    navContainer.classList.add("nav2");
    navContainer.innerHTML = navItems.join("");
  
    const observer = new IntersectionObserver(
      (entries) => {
        document.querySelectorAll(".nav-link1").forEach((navLink) => {
          navLink.classList.remove("nav-link-selected");
        });
  
        const visibleSection = entries.filter((entry) => entry.isIntersecting)[0];
  
        document
          .querySelector(
            `.nav-item1[data-for-section="${visibleSection.target.id}"] .nav-link1`
          )
          .classList.add("nav-link-selected");
      },
      { threshold: 0.5 }
    );
  
    sections.forEach((section) => observer.observe(section));
  
    document.body.appendChild(navContainer);
  }
  
  activateNavigation();
  