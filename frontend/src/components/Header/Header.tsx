import { LogInButton, SignUpButton } from '../Buttons/Buttons';

const navItems = [
    { name: 'Home', href: '/' },
    { name: 'Companies', href: '/companies' },
    { name: 'Security', href: '/security' },
    { name: 'Learn More', href: '/learn-more' },
];


export function Header() {
    const listNav = navItems.map((item) => (
        <li key={item.name}>
            <a href={item.href}>{item.name}</a>
        </li>
    ));

    return (
        <header>
            <div>
                <h2 className="header-title">BankName</h2>
                <nav>
                    <ul className="header-nav">{listNav}</ul>
                </nav>
                <div className="header-buttons">
                    <LogInButton />
                    <SignUpButton />
                </div>
            </div>
        </header>
    )
}